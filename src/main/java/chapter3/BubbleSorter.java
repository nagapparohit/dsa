package chapter3;

public class BubbleSorter {
	
	private int[] data;
	
	public BubbleSorter() {
		// TODO Auto-generated constructor stub
	}
	
	public BubbleSorter(int[] data) {
		this.data = data;
	}
	
	public int[] getData() {
		return data;
	}
	/**
	 * @param data
	 */
	public void setData(int[] data) {
		if(data==null)
			throw new RuntimeException("Data cannot be null");
		this.data = data;
	}
	
	
	public void sort() {
		
		for(int i=0 ; i < data.length - 2; i++) {
			
			for(int j= data.length -1 ; j > 1; j--) {
				if(data[j] < data[j-1]) {
					int tmp = data[j];
					data[j] = data[j-1];
					data[j-1] = tmp;
				}
			}
		}
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for(int i:data) {
			sb.append(i);
			sb.append(',');
		}
		
		sb.deleteCharAt(sb.length()-1);
		sb.append('}');
		return sb.toString();
	}
	
	
}
