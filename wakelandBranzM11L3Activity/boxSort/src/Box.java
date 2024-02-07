/*
 * Wakeland Branz
 * Date: 2/6/2024
 * Seaforth High School
 *
 * Description:  Creates box instances and performs basic algorithms on them
 * Difficulties:  I had none, this assignment was relatively simple.
 * What I Learned:  Cross-file usage in Java
 */

public class Box {
  private double length, height, depth;

  public Box( double length, double height, double depth ) {
    this.length = length;
    this.height = height;
    this.depth  = depth;
  }

  public double volume()
  {
    return length*height*depth;
  } 
  // compare this Box to another Box  
  // 1 = this volume is greater than other volume
  // 0 = this volume is equal to other volume
  // -1 = this volume is less than other volume
  int compareTo( Box other ) {
    double thisVolume = this.volume();
    double otherVolume = other.volume();
    if (thisVolume > otherVolume) {
      return 1;
    }
    else if (thisVolume < otherVolume ) {
      return -1;
    }
    return 0;
  }

  public String toString() {
    return( "length: " + length + ",  height: " + height + ",  depth: " + depth + ",  volume: " + volume() );
  }
  
}

/*
 * Sample output:
 * Before: 
 * length: 1.0,  height: 2.3,  depth: 2.7,  volume: 6.21
 * length: 1.0,  height: 4.9,  depth: 3.2,  volume: 15.680000000000001 
 * length: 3.0,  height: 1.3,  depth: 2.7,  volume: 10.530000000000001 
 * length: 3.0,  height: 0.1,  depth: 4.67,  volume: 1.4010000000000002
 * length: 1.3,  height: 1.3,  depth: 1.3,  volume: 2.1970000000000005 
 * length: 4.0,  height: 2.3,  depth: 1.7,  volume: 15.639999999999999
 * length: 2.2,  height: 2.1,  depth: 1.67,  volume: 7.715400000000002
 * length: 2.3,  height: 7.3,  depth: 6.3,  volume: 105.77699999999999
 * length: 2.0,  height: 3.3,  depth: 5.3,  volume: 34.98

 * After:
 * length: 3.0,  height: 0.1,  depth: 4.67,  volume: 1.4010000000000002
 * length: 1.3,  height: 1.3,  depth: 1.3,  volume: 2.1970000000000005
 * length: 1.0,  height: 2.3,  depth: 2.7,  volume: 6.21
 * length: 2.2,  height: 2.1,  depth: 1.67,  volume: 7.715400000000002
 * length: 3.0,  height: 1.3,  depth: 2.7,  volume: 10.530000000000001
 * length: 4.0,  height: 2.3,  depth: 1.7,  volume: 15.639999999999999
 * length: 1.0,  height: 4.9,  depth: 3.2,  volume: 15.680000000000001
 * length: 2.0,  height: 3.3,  depth: 5.3,  volume: 34.98
 * length: 2.3,  height: 7.3,  depth: 6.3,  volume: 105.77699999999999
 */