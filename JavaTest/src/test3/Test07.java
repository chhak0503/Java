package test3;

class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title, String director, double rating) {
    	this.title = title;
    	this.director = director;
    	this.rating = rating;
    }

    public void show() {
        System.out.println("--------------------");
        System.out.println("영화제목: " + title);
        System.out.println("영화감독: " + director);
        System.out.println("영화평점: " + rating);
    }
}

public class Test07 {
    public static void main(String[] args) {
    	
        // 영화 객체 배열 생성
        Movie[] movies = {            
            new Movie("터미네이터", "제임스 카메론", 8.8),
            new Movie("글래디에이터", "리들리 스콧", 9.5),
            new Movie("쥬라기공원", "스티븐 스필버그", 9.2),
            new Movie("인터스텔라", "크리스토퍼 놀란", 8.9)
        };

        for (Movie m : movies) {
            m.show();
        }
    }
}













