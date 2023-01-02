package bai2;

public class Poin3D extends Poin2D {
    private float z;
    public Poin3D (){

    }
    public Poin3D (float z,float x,float y){
        super(x, y);
        this.z=z;
    }


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] setxyz(float z,float x, float y){
        return new float[]{x,y,z};
    }

    @Override
    public String toSstring() {
        return "xyz: "+
                super.toSstring();
    }
}
