package com.capg.omts.booking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.booking.Exception.AuthenticationFailedException;
import com.capg.omts.booking.Exception.SlotNotAvailableException;
import com.capg.omts.booking.Exception.TicketCancellationException;
import com.capg.omts.booking.dao.ILoginDao;
import com.capg.omts.booking.model.Ticket;
import com.capg.omts.booking.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
    TicketRepository ticketRepo;
	
	//method that returns ticket based on ID
	@Override
	public Ticket showTicket(int ticketId)  {
		
		return ticketRepo.findById(ticketId).get();
     }
	 
	//method that adds a ticket
	@Override
	public Ticket addTicket(Ticket ticket) throws SlotNotAvailableException {
		
          return ticketRepo.save(ticket);
        }

	//method to delete a particular ticket by ID 
	@Override
	public boolean cancelBooking(int ticketId) throws TicketCancellationException {

		if (ticketRepo.existsById(ticketId)) 
		{
			ticketRepo.deleteById(ticketId);
		}
		else {
			throw new TicketCancellationException("Cancellation Failed : Id not found");
		}
		return true;
	}

	//method to get all the bookings
    @Override
     public List<Ticket> getAllBookings(Ticket ticket) {
	
	    return ticketRepo.findAll();
     }
    @Autowired
    private ILoginDao lDao;
    @Override
	public String login(UserDetails userDetails) {
		String role = "";
		Optional<UserDetails> op = lDao.findById(userDetails.getUsername());
        if(!op.isPresent()){
            throw new AuthenticationFailedException("No User found for username="+userDetails.getUsername());
        }
		UserDetails uDetails = op.get();
		if(!userDetails.getPassword().equals(uDetails.getPassword())) {
            throw new AuthenticationFailedException("Authentification failed for username="+userDetails.getUsername());
		}
		role = uDetails.getUserRole();
		return role;
	}


}