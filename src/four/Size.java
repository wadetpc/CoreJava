package four;

enum  Size {
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    public String getAbbreviation() {
        return abbreviation;
    }

    private String abbreviation;
    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
