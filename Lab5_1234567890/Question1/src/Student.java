
public class Student {
	private int ID;
	private boolean sleeping;
	
	public Student(int ID) {
		this.ID=ID;
		sleeping=false;//initially a student is awake
	}
	public int getID() {
		return ID;
		}
		public boolean isSleeping() {
		return sleeping;
		}
		public void fallAsleep() {
		sleeping = true;
		}
		public void wakeUp() {
		sleeping = false;  
		}
		public static void testStudent() {
		Student s = new Student(1234567890);
		System.out.println(s.getID() == 1234567890);
		System.out.println(s.isSleeping() == false);
		s.fallAsleep();
		System.out.println(s.isSleeping() == true);
		s.fallAsleep(); // should do nothing because the student is already sleeping
		System.out.println(s.isSleeping() == true);
		s.wakeUp();
		System.out.println(s.isSleeping() == false);
		s.wakeUp(); // should do nothing because the student is already awake
		System.out.println(s.isSleeping() == false);
		}
}
