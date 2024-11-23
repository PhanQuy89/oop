public class MyTime {
    private int hour;
    private int minute;
    private int second;
    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Giờ không hợp lệ. Giờ phải trong khoảng 0 đến 23.");
        }
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public MyTime nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
        public MyTime nextMinute() {
            minute++;
            if (minute >= 60) {
                minute = 0;
                nextHour();
            }
            return this;
        }

        public MyTime nextHour() {
            hour++;
            if (hour >= 24) {
                hour = 0;
            }
            return this;
        }

        public MyTime previousSecond() {
            second--;
            if (second < 0) {
                second = 59;
                previousMinute();
            }
            return this;
        }

        public MyTime previousMinute() {
            minute--;
            if (minute < 0) {
                minute = 59;
                previousHour();
            }
            return this;
        }

        public MyTime previousHour() {
            hour--;
            if (hour < 0) {
                hour = 23;
            }
            return this;
        }
    }
