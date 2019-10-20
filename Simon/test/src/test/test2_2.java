package test;

public class test2_2 {

	public static void main(String[] args) {
		float[] a;
		a = new float[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = a[1]-a[2];
        for (int i = 0; i < a.length; i++) {
        	a[i] =  (float) (a[i]*(1.1));
        	System.out.println(a[i]);	
        }
	}

}
