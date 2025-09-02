#include <iostream>
using namespace std;

int main() {

  int n = 0;
  int num[10] = {0};
  int max = 0, sum = 0;

  cin >> n;

  for (int i = 0; i < n; i++) {
    cin >> num[i];
    sum += num[i];
  }

  max = num[0];

  for (int i = 1; i < n; i++) {
    if (num[i] >= max) {
      max = num[i];
    }
  }

  cout << max << "," << sum;

  return 0;
}
