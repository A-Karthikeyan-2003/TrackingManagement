package DataModel;
public class Package {
    
	private int PackageId, PackageQuantity;
	
	private String PackageName,PackageType , PackageWeight, PackageRate,SellerName,SellerLoc;

	
	public Package(int packageId, String packageName, String packageType, int packageQuantity, String packageWeight,
			String packageRate, String SellerName, String SellerLoc) {
	
		PackageId = packageId;
		PackageName = packageName;
		PackageType = packageType;
		PackageQuantity = packageQuantity;
		PackageWeight = packageWeight;
		PackageRate = packageRate;
		this.SellerName = SellerName;
		this.SellerLoc = SellerLoc;
	}


	public String getSellerName() {
		return SellerName;
	}


	public String getSellerLoc() {
		return SellerLoc;
	}


	public int getPackageId() {
		return PackageId;
	}


	public String getPackageName() {
		return PackageName;
	}

	public void setPackageName(String packageName) {
		PackageName = packageName;
	}

	public String getPackageType() {
		return PackageType;
	}

	public void setPackageType(String packageType) {
		PackageType = packageType;
	}

	public int getPackageQuantity() {
		return PackageQuantity;
	}

	public void setPackageQuantity(int packageQuantity) {
		PackageQuantity = packageQuantity;
	}

	public String getPackageWeight() {
		return PackageWeight;
	}

	public void setPackageWeight(String packageWeight) {
		PackageWeight = packageWeight;
	}

	public String getPackageRate() {
		return PackageRate;
	}

	public void setPackageRate(String packageRate) {
		PackageRate = packageRate;
	}



	public String toString() {
		return "-------------------\nPackageID = " + PackageId + "\nPackageName = " + PackageName + ", \nPackageType = " + PackageType + ", \nPackageQuantity = "
				+ PackageQuantity + ", \nPackageWeight = " + PackageWeight + ",\nPackageRate = " + PackageRate
				+ "";
	}
	
	
	
	
	
	
}
