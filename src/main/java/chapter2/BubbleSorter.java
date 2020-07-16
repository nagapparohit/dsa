package chapter2;

public class BubbleSorter {

		public int[] sort(int[] data) {
			
			boolean flag = true;
				
			for(int i=0;i<data.length-1;i++) {
				
				
				for(int j=0;j<data.length -i -1 ; j++ ) {
					
					if(data[j] > data[j+1]) {
						int tmp = data[j];
						data[j] = data[j+1];
						data[j+1] = tmp;
						flag = false;
					}
				}
				if(flag)
					break;
				
			}
			
			return data;
			
		}
}
