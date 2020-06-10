package org.adactincucumberhookpojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPOJOClass  extends BaseClass{
	public SearchHotelPOJOClass() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private  WebElement  Hotels;
	
	@FindBy(id="room_type")
	private  WebElement RoomType;
	
	@FindBy(id="room_nos")
	 private WebElement  NumberOFRooms;
	
	@FindBy(id="datepick_in")
	private WebElement CheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement CheckOutDate;
	
	@FindBy(id="adult_room")
	private  WebElement  AdultPerRoom;
	
	@FindBy(id="child_room")
	private  WebElement  ChildPerRoom;
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNumberOFRooms() {
		return NumberOFRooms;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return ChildPerRoom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy(id="Submit")
	private WebElement Submit;

	
	
	
}

