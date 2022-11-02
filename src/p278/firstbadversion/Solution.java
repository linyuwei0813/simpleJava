package p278.firstbadversion;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

import model.VersionControl;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int head = 1;
        int tail = n;
        int mid = mid(head, tail);
        while (mid >= 1 && mid <= n) {
            if (isBadVersion(mid)) {
                if (mid == 1) {
                    return mid;
                } else {
                    if (!isBadVersion(mid - 1)) {
                        return mid;
                    } else {
                        tail = mid - 1;
                        mid = mid(head, tail);
                    }
                }
            } else {
                head = mid + 1;
                mid = mid(head, tail);
            }
        }
        return -1;
    }

    private int mid(int head, int tail) {
        return head / 2 + tail / 2 + (head % 2 + tail % 2) / 2;
    }
}
