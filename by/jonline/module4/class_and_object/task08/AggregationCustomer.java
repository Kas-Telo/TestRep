package by.jonline.module4.class_and_object.task08;

public class AggregationCustomer {
	private SortCustomerList sort = new SortCustomerList();
	private CustomerList customers = CustomerList.getInstance();

	public String[] getCustomerListWhithNumberOfCreditCardInTheRange(int startRange, int finishRange) {
		int lengthOfList;
		String[] neededCustomerList = null;
		Customer[] customerList;

		if (customers.customerList != null) {
			lengthOfList = customers.customerList.length;
			neededCustomerList = new String[lengthOfList];
			customerList = customers.customerList;

			int j = 0;
			for (int i = 0; i < customerList.length; i++) {
				if (intervalEntryCheck(customerList[i].getCreditCardNumber(), startRange, finishRange)) {
					neededCustomerList[j] = customerList[i].toStringName();
					j++;
				}
			}
			
			if (neededCustomerList[0] == null) {
				neededCustomerList = null;
			}
		}

		return neededCustomerList;
	}

	private boolean intervalEntryCheck(int creditCardNumber, int startRange, int finishRange) {
		if (creditCardNumber >= startRange && creditCardNumber <= finishRange) {
			return true;
		}

		return false;
	}

	public String[] getCustomerListInAlphabetOrder() {
		String[] newCustomerNameList = null;

		if (customerNames() != null) {
			newCustomerNameList = customerNames();

			sort.inAlphabetOrder(newCustomerNameList);
		}

		return newCustomerNameList;
	}

	private String[] customerNames() {
		int lengthOfList;
		String[] customerNames = null;

		if (customers.customerList != null) {
			lengthOfList = customers.customerList.length;
			customerNames = new String[lengthOfList];

			for (int i = 0; i < lengthOfList; i++) {

				customerNames[i] = customers.customerList[i].toStringName();
			}
		}

		return customerNames;
	}

}
