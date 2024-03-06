package test01;

public class Music {
	private String title;
	private String singer;
	
	public Music() {
		super();
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	@Override
	public int hashCode() {
		String str = title + singer;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music m = (Music)obj;
			
			if(this.getTitle().equals(m.getTitle()) &&
				this.getSinger().equals(m.getSinger())) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public int compareTo(Object o) {
		
		
		return 0;
	}
	
	
}
