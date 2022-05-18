public enum Shapes {
    square,
    triangle,
    rectangle,
    circle,
    trapezoid,
    rhombus,
    oval,
    hexagon
}

class DisplayShapes{
    Shapes s1=Shapes.square;
    void changeShape(){
        switch (s1){
            case square:
                s1= Shapes.rectangle;
                break;
            case triangle:
                s1= Shapes.oval;
                break;

            case rectangle:
                s1= Shapes.circle;
                break;
            case circle:
                s1= Shapes.trapezoid;
                break;
            case trapezoid:
                s1=Shapes.rhombus;

            case rhombus:
                s1= Shapes.triangle;
                break;
            case oval:
                s1=Shapes.hexagon;
                break;

            case hexagon:
                s1=Shapes.square;
                break;

        }
    }
    public String toString(){
        return ""+s1;
    }
}



class Task1 {
    public static void main(String[] args) {
        DisplayShapes ds= new DisplayShapes();
        for(int i=0; i<7;i++){
            System.out.println(ds);
            ds.changeShape();
        }
    }
}

