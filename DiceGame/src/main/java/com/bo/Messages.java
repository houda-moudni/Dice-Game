package com.bo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Messages {

        public static final int INFO = 0;
        public static final int ERROR = 1;
        public static final int WARN = 2;
        private String text;
        private int type;
        private LocalDateTime timestamp;

        public Messages(String text, int type) {
            this.text = text;
            this.type = type;
            this.timestamp = LocalDateTime.now();
        }


        @Override
        public String toString() {
            return  "[" + timestamp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "] " +
                    "[" + type + "] : "
                    + text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }



}


