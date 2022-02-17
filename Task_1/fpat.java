package fpat;

/**
 *
 * @author AnriTool
 */


public class fpat {
	
    public static void main(String[] args) {
        vec3d v1 = new vec3d(); 
        vec3d v2 = new vec3d(1,2,3);
        vec3d v3 = new vec3d(4,5,6);
        
        v1.print();
        v2.print();
        
        System.out.println("Геттеры и сеттеры");
        System.out.println(v2.getX() + " " + v2.getY() + " " + v2.getZ());
       
        System.out.println("Длина вектора(модуль)");
        System.out.println(v2.len());
        
        System.out.println("Скалярное произведение");
        System.out.println(v2.scalMult(v3));
        
        System.out.println("Векторное произведение");
        v2.vecMult(v3).print();
        
        System.out.println("Сумма");
        v2.sum(v3).print();
        
        System.out.println("Разность");
        v2.diff(v3).print();

        System.out.println("Сложить");
        v2.plus(v3);
        v2.print();
        
        System.out.println("Вычесть");
        v2.minus(v3);
        v2.print();
        
        System.out.println("Массив случайных векторов размером N");
        
        int n = 4;
        vec3d[] arr = vec3d.randomN(n);
        for(int i = 0; i < n; i++) {
        	arr[i].print();
        } 
    }  
}