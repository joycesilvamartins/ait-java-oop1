package oop;

class Volume {//package private

    private int lenght;//instance variables
    private int width;
    private int height;

    Volume() {//constructor no-args                new Volume()
        // initialise the instance variables to default values    (constructor name must match class name, not have a method with same name)   
        lenght = 0;
        width = 0;
        height = 0;
    }

    Volume(int l, int w, int h) {//constructor     new Volume(2,3,4)
        lenght = l;
        width = w;
        height = h;
    }

    public int calcVolume() {
        int vol = lenght * height * width;
        return vol;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {  // v.setLength(5);
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
       String s = "Lenght is " + lenght+ "\n";
       s+= "Width is " + width + "\n";
       s= s+"Height is " + height + "\n";
        return s;
    }

}//end of class
