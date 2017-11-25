#include "template.h"

class Solution {
public:
    bool isHappy(int n) {
        unordered_set<unsigned long> _set;
        unsigned long num = n;
        
        while (_set.find(num) == _set.end()) {
            _set.insert(num);
            cout << num << endl;
            unsigned long next = 0;
            while (num != 0) {
                unsigned long re = num % 10;
                next += re * re;
                num /= 10;
            }
            if (next == 1) {
                return true;
            }
            num = next;
        }
        return false;
    }
};

int main() {
    Solution s;
    cout << s.isHappy(5) << endl;
}
