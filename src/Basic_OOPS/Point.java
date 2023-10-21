package Basic_OOPS;

public class Point {
    static final double PI = 3.1434293828;
    private static int count;

    private int id;

    static
    {
        count = 1000;
    }
    final int x;
    final int y;
    Point(){
        this(100,100);
    }

    Point(int x, int y ){
        this.x = x;
        this.y = y;
        this.id=++count;

    }

    void get_x_y()
        {
            System.out.println(x);
            System.out.println(y);
        }

    static int get_count()
        {
            return count;
        }
    static void set_count(int o)
        {
            count = o;

        }


    int get_id()
    {
        return id;
    }


}

