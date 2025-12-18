package model;

public class OnlineCourse extends Course {

    private String platform;

    public OnlineCourse(String courseCode, String title, String platform) {
        super(courseCode, title);
        this.platform = platform;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Platform: " + platform);
    }
}
