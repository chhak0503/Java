package sub2;
/*
문제2. 아래 요구사항을 충족하는 Movie 클래스를 정의하세요.

<속성>
 - title (String): 영화 제목
 - director (String): 감독 이름
 - rating (double): 영화 평점 (0.0 ~ 10.0 사이의 값)
 - availableSeats (int): 예약 가능한 좌석 수

<생성자>
 - 모든 인스턴스 변수를 초기화하는 생성자

<메서드>
 reserveSeat()
  - 예약 가능한 좌석이 있으면 availableSeats를 1 감소시키고 true를 반환
  - 예약 가능한 좌석이 없으면 false를 반환
 
 cancelReservation()
  - availableSeats를 1 증가

 showDetails()
  - 모든 멤버 변수 값을 출력
*/
public class Movie {

	private String title;
	private String director;
	private double rating;
	private int availableSeats;
	
	public Movie(String title, String director, double rating, int availableSeats) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.availableSeats = availableSeats;
	}
	
	public boolean reserveSeat() {
		if(availableSeats > 0) {
			availableSeats--;
			return true;
		}else {
			return false;
		}
	}
	
	public void cancelReservation() {
		availableSeats++;
	}
	
	public void showDetails() {
		System.out.println("제목 : " + this.title);
		System.out.println("감독 : " + this.director);
		System.out.println("평점 : " + this.rating);
		System.out.println("좌석수 : " + this.availableSeats);
	}
	
}











