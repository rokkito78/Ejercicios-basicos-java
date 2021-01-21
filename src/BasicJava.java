import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

	//Ejercicio 1
	void printNumber() {
		for (int i=1; i<=255; i++) {
			System.out.println(i);
		}
	}
	//Ejercicio 2
	void printImpar() {
		for (int i=1; i<=255; i+=2) {
			System.out.println(i+" impar");
		}
	}
	//Ejercicio 3
	void printSum() {
		int sum = 0;
		for (int i=0; i<=255; i++) {
			sum= sum  + i;
			System.out.println(" Nuevo Numero "+ i + " suma " + sum);
		}
	}
	//Recorrer un Arreglo

	//Ejercicio 4
	void arreglo() {
		int arr[]= {1,3,5,7,9,13};
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr [i]);
		}
	}
	//Encontrar el Máximo

//Ejercicio 5
	void arrMax() {
		int array[]= {-3,-5,-7};
		int max = array[0];
		for (int i=0; i<array.length; i++) {
			if(array[i]> max) {
				max= array[i];
			}
		}
		System.out.println("El Mayor es: "+max);
	}
	//Obtener el Promedio

//Ejercicio 6
	
	void promPrint() {
		int arr[]= {2,10,3};
		int sum = 0;
		int div = 0;
		int prom = 0;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			div = arr.length;
			prom = sum/div;
		}
		System.out.println("El promedio es: "+prom);
	}
//Arreglo con Números Impares

//Ejercicio 7
	
	void arrayImpares (){
		int y[];
		y = new int[256];
		int j = 0;
	 	for(int i=1; i<=255;i++){

	 		if(i%2!=0) {
	 			y[j] =  i;
	 			j++;
	 		}  				
		}
	 	System.out.println(Arrays.toString(y));
	}
//Mayor que Y

//Ejercicio 8
	void mayorY (){
		   int sum=0;
		   int arr[] = {1,3,5,7};
		   int Y = 3;
		   for(int i=0;i<arr.length;i++){
		    if(arr[i]>Y){
		        sum++;
		    }

		   }
		   System.out.println(sum);
		}
//Valores al Cuadrado

//Ejercicio 9
	
	 void cuadrado () {
		 int array[] = {1,5,10,-2};

		  for( int i=0;i<=3;i++){
			  array[i] = array [i] * array[i];
			  System.out.println(array[i]);
		    }

		}
//Eliminar Números Negativos

//Ejercicio 10
	 
	 void numNeg () {
			int arr[]= {1,5,10,-2};
			  for( int i=0;i<4;i++){
				  if(arr[i]>0){
			      arr [i] = arr[i];

			       }else {     
			    	   arr [i] = 0;       
		}

			  }System.out.println(Arrays.toString(arr));
		}
//Mínimo, Máximo y Promedio

//Ejercicio 11
	 
	 void nuevoArray(){
	     int suma=0;
	     int arr[] = {1,5,10,-2}; 
	     int mayor= arr[0];
	     int menor= arr[0];
	     int prom= 0;
	     ArrayList<Integer> lista = new ArrayList<Integer>();
	    for(int i=0;i<4;i++){

	        suma = suma + arr[i];
	        if(arr[i]>mayor){
	            mayor=arr[i];

	        }
	        if(arr[i]<menor){
	            menor=arr[i];

	        }
	    }prom=suma/4;
	    lista.add(mayor);
	    lista.add(menor);
	    lista.add(prom);
	    System.out.println(lista.toString());
	}
//Cambiando los Valores del Arreglo

//Ejercicio 12
	 
	 void IntercambiaValores(){
			int arr[] = {1,5,10,7,-2};
		    for( int i=0;i<=4;i++){
		    	if(i==4){
		            arr[i]=0;
		           }if(i<=3) {

		        	   arr[i] = (arr[i+1]);
		        	   }

		    } 
			System.out.println(Arrays.toString(arr));
			}
} 
