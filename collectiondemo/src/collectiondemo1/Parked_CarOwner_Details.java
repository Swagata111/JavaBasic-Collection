package collectiondemo1;

public class Parked_CarOwner_Details
{
public String ownerName;
public String carModel;
public String carNO;
public String owerMobileNo;
public String owerAddress;
public Parked_CarOwner_Details(String ownerName, String carModel, String carNO, String owerMobileNo,
		String owerAddress) {
	
	this.ownerName = ownerName;
	this.carModel = carModel;
	this.carNO = carNO;
	this.owerMobileNo = owerMobileNo;
	this.owerAddress = owerAddress;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public String getCarModel() {
	return carModel;
}
public void setCarModel(String carModel) {
	this.carModel = carModel;
}
public String getCarNO() {
	return carNO;
}
public void setCarNO(String carNO) {
	this.carNO = carNO;
}
public String getOwerMobileNo() {
	return owerMobileNo;
}
public void setOwerMobileNo(String owerMobileNo) {
	this.owerMobileNo = owerMobileNo;
}
public String getOwerAddress() {
	return owerAddress;
}
public void setOwerAddress(String owerAddress) {
	this.owerAddress = owerAddress;
}
@Override
public String toString() {
	return "Parked_CarOwner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNO=" + carNO
			+ ", owerMobileNo=" + owerMobileNo + ", owerAddress=" + owerAddress + "]";
}



}
