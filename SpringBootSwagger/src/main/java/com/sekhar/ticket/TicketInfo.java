package com.sekhar.ticket;

import lombok.Data;

@Data
public class TicketInfo {

	private String name;
	private Integer age;
	private String gender;
	private String phnum;
	private Integer ticketId;
	private String pnrnum;
	private String doj;
	private String from;
	private String to;
	private String seatnum;
	private String status;
	private Double price;
}
