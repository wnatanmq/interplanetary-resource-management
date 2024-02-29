package org.root.MineralObjectDetector.Enums;

public class MinerEnum {
    public enum Status{ 
        INACTIVE(0),
        OPERANT(1),
        INOPERANT(2),
        MAINTEANCE(3),
        BLOCKED(4),
        DELETE(5);

        private final int status;

        Status(int status) {
            this.status = status;
        }

        public int getStatus() {
            return status;
        }
    }
}
