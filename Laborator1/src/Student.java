public class Student {
	public String nume;     
    public String prenume;      
    public String email;    
    public int credite;     
    public double medie;
    
    public Student(String nume, String prenume, String email, int credite, double medie) {
        this.nume   = nume;
        this.prenume    = prenume;
        this.email   = email;
        this.credite = credite;
        this.medie=medie;
    }
    
    
    public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public String getPrenume() {
		return prenume;
	}


	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getCredite() {
		return credite;
	}


	public void setCredite(int credite) {
		this.credite = credite;
	}


	public double getMedie() {
		return medie;
	}


	public void setMedie(double medie) {
		this.medie = medie;
	}


	public String toString() {
    	return this.getNume() + "," + this.getPrenume() + "," + this.getEmail()
        + "," + this.getCredite() + "," + this.getMedie();
    }
    
    
    
 }
   