package org.example.codewarskatas.codewarsstylerankingsystem;

public class User {
    public int rank;
    public int progress;

    public User() {
        this.rank = -8;
        this.progress = 0;
    }

    /*
    Completing an activity that is ranked the same as that of the user's will be worth 3 points
    Completing an activity that is ranked one ranking lower than the user's will be worth 1 point
    Any activities completed that are ranking 2 levels or more lower than the user's ranking will be ignored
    Completing an activity ranked higher than the current user's rank will accelerate the rank progression.
    The greater the difference between rankings the more the progression will be increased. The formula is 10 * d * d where d equals the difference in ranking between the activity and the user.
     */
    public void incProgress(int rank) {
        if (-8 > rank || rank > 8 || rank == 0) {
            throw new IllegalArgumentException();
        }
        int diff = this.rank - rank;
        if (this.rank > 0 && rank < 0) {
            diff --;
        }
        if (this.rank < 0 && rank > 0) {
            diff ++;
        }
        if (diff == 0) {
            progressFunc(3);
            return;
        }
        if (diff == 1) {
            progressFunc(1);
        } else if (diff < 0) {
            progressFunc(10 * diff * diff);
        }
    }

    private void progressFunc(int p) {
        if (rank >= 8) {
            progress = 0;
            return;
        }
        if (progress + p >= 100) {
            rank ++;
            rank = rank == 0 ? 1 : rank;
            progressFunc(p - 100);
        } else {
            progress += p;
        }
    }
}
