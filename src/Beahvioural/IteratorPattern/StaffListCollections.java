package Beahvioural.IteratorPattern;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class StaffListCollections implements Iterable {

	private Employees[] emp = null;
	
	public StaffListCollections(Employees...emp1) {
		this.emp = emp1;
	}

	public Employees[] getEmp() {
		return emp;
	}


	@Override
	public StaffListiterator iterator() {
		return new StaffListiterator(this);
	}
	
	public static class StaffListiterator implements Iterator{
		
		private StaffListCollections staffListCollections;
		private  int index =0;
		
		public StaffListiterator(StaffListCollections staffListCollections) {
			this.staffListCollections = staffListCollections;
		}

		@Override
		public boolean hasNext() {
			int size = staffListCollections.getEmp().length;
			if(index<size)
			{
				return true;
			}else {
				return false;
			}
		}

		@Override
		public Employees next() {
			Employees[] emp = staffListCollections.getEmp();
			
			if(hasNext())
			{
				return emp[index++];
			}else {
				return null;
			}
			
		}
		
	}
	
	

}
