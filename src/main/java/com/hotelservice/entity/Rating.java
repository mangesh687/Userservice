package com.hotelservice.entity;

public class Rating {
private String ratingid;
private String userid;
private String hotelid;
public String getRatingid() {
	return ratingid;
}
public void setRatingid(String ratingid) {
	this.ratingid = ratingid;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getHotelid() {
	return hotelid;
}
public void setHotelid(String hotelid) {
	this.hotelid = hotelid;
}
@Override
public String toString() {
	return "Rating [ratingid=" + ratingid + ", userid=" + userid + ", hotelid=" + hotelid + "]";
}
public Rating(String ratingid, String userid, String hotelid) {
	super();
	this.ratingid = ratingid;
	this.userid = userid;
	this.hotelid = hotelid;
}
public Rating() {
	super();
	// TODO Auto-generated constructor stub
}

}
