package test2;

public class SinhVien {
	public String name;
	public int age;
	
	public String getName() {
		return name;
	}
	
	public void Setname(String name) {
		if(name == null || name.isEmpty()) {
			this.name = "Name null";
			
		}else {
			this.name  = name;
		}
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void Setage(int age) {
		if(age <0 || age> 150) {
			this.age = -1;
		}else {
		this.age = age;
		}
	}

}
