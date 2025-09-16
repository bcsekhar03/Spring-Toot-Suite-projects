package com.sekhar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketInfo {

	private Integer ticketId;
	private String pnr;
	private String status;
	private String seatnum;
}
