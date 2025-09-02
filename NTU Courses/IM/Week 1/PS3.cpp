#include <iostream>
using namespace std;

int main() {

  int h = 0, m = 0, s = 0, x = 0;
  cin >> h >> m >> s >> x;

  int time = h * 3600 + m * 60 + s;
  time += x;

  s = time % 60;
  m = ((time - s) % 3600) / 60;
  h = (time - s - m * 60) / 3600;

  cout << h << ":" << m << ":" << s;

  return 0;
}
