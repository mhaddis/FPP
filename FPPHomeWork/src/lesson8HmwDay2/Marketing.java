package lesson8Hmw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Marketing {

	String employeename;
	String productname;
	int salesamount;
	

	public Marketing(String employeename, String productname, int salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(int salesamount) {
		this.salesamount = salesamount;
	}

	@Override
	public String toString() {
		return "Employee name: " + employeename + "	Product name: " + productname + "	Sales amount " + salesamount;
	}

	@Override
	public int hashCode() {
		
		 return Objects.hash(employeename, productname, salesamount);

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Marketing m = (Marketing) obj;
		boolean equal = employeename.equals(m.employeename) && productname.equals(m.productname)
				&& (salesamount == m.salesamount);
		return equal;
	}
}
