enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class EnumExample {
    public static void main(String[] args) {
        WeekDay day = WeekDay.SUNDAY;

        for(WeekDay wd:WeekDay.values()){
            System.out.println(wd);
        }
        //System.out.println(day);
    }
}