package 제네릭예제3;
// 타입변수의 자료형은 경정 되지 않았음
public class GenericPrinter<T extends Material>{
    private T material; // T 자료형으로 선언한 변후

    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
 }
