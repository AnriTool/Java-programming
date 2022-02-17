package fpat;

/**
 *
 * @author AnriTool
 */


public class vec3d {

    private double x, y, z;

    //1. конструктор с параметрами в виде списка координат x, y, z
    public vec3d() {
        x = 0; y = 0; z = 0;
    }
    
    public vec3d(double x, double y, double z){
        this.x = x; this.y = y; this.z = z;
    }
    //2. методы для чтения и записи значений координат (геттеры и сеттеры). 
    public double getX(){
        return x;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getZ(){
        return z;
    }
    
    public void setZ(double z){
        this.z = z;
    }
    
    //3. метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
    public double len() {
    	return Math.sqrt(x*x+y*y+z*z);
    }
    
    //4. метод, вычисляющий скалярное произведение с другим вектором
    public double scalMult(vec3d a) {
    	return x*a.getX()+y*a.getY()+z*a.getZ();
    }
    //5. метод, вычисляющий векторное произведение с другим вектором
    public vec3d vecMult(vec3d a) {
    	return new vec3d(y*a.getZ() - z*a.getY(), x*a.getZ()-z*a.getX(),x*a.getY()-y*a.getX());
    }
    //6. методы для суммы и разности
    
    //Методы создающие новые вектора
//    public vec3d sum(vec3d a) {
//    	return new vec3d(x+a.getX(),y+a.getY(),z+getZ());
//    }

 // Статический метод с переменным количеством аргументов для суммы 
    static vec3d sum(vec3d ...a){
    	vec3d res = new vec3d();
    	
    	for(int i = 0; i < a.length; i++) {
    		res.setX(res.getX() + a[i].getX());
    		res.setY(res.getY() + a[i].getY());
    		res.setZ(res.getZ() + a[i].getZ());
    	}
    	return res;
    }
    
//    public vec3d dif(vec3d a) {
//    	return new vec3d(x-a.getX(),y-a.getY(),z-a.getZ());
//    }
    
// Статический метод с переменным количеством аргументов для разности
    static vec3d diff(vec3d ...a){
    	vec3d res = new vec3d();
    	res.setX(a[0].getX());
		res.setY(a[0].getY());
		res.setZ(a[0].getZ());
    	for(int i = 1; i < a.length; i++) {
    		res.setX(res.getX() - a[i].getX());
    		res.setY(res.getY() - a[i].getY());
    		res.setZ(res.getZ() - a[i].getZ());
    	}
    	return res;
    }
    
    //Методы добавляющие данные из второго вектора в первый
    public void plus(vec3d a) {
    	x = x + a.getX();
    	y = y + a.getY();
    	z = z + a.getZ();
    }
    
    public void minus(vec3d a) {
    	x = x - a.getX();
    	y = y - a.getY();
    	z = z - a.getZ();
    }
    
    //7. статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.       
    static vec3d[] randomN(int n) {
    	vec3d[] array = new vec3d[n];
    	for(int i = 0;  i < n; i++) {
    		array[i] = new vec3d(Math.random()*10,Math.random()*10,Math.random()*10);
    	}
    	return array;
    }
    
    //Метод для вывода вектора
    public void print() {
    	System.out.println("(" + x + ";" + y + ";" + z + ")");
    }
    
}