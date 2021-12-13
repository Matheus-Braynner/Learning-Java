package model.entities;

import java.util.Date;

public class CarRental {
	
	private Date start;
	private Date finished;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(Date start, Date finished, Vehicle vehicle) {
		this.start = start;
		this.finished = finished;
		this.vehicle = vehicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinished() {
		return finished;
	}

	public void setFinished(Date finished) {
		this.finished = finished;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	

}
