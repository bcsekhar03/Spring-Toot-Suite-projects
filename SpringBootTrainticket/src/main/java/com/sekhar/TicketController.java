package com.sekhar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

	@PostMapping(value="/ticket",
			produces= {"application/json"}, 
		    consumes= {"application/json"})
			
	public ResponseEntity<BookingResponse> bookticket(@RequestBody passenger request){
				
		TicketInfo ti=new TicketInfo();	
		ti.setTicketId(1122);
		ti.setPnr("j11253");
		ti.setStatus("Confirmed");
		ti.setSeatnum("S8 24");
		
		BookingResponse book=new BookingResponse();
		book.setPassenger(request);
		book.setTicket(ti);
		
		return new ResponseEntity<>(book,HttpStatus.CREATED);
	}
}
