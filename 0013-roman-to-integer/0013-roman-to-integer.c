int romanDigit(char c) {
    switch (c) {
      case 'I': return 1;
      case 'V': return 5;
      case 'X': return 10;
      case 'L': return 50;
      case 'C': return 100;
      case 'D': return 500;
      case 'M': return 1000;
      default: return 0;
    }
}


int romanToInt(const char *s) {
    int sum = 0;
    while (*s) {
        int digit = romanDigit(*s++);
        int next = romanDigit(*s);
        if (digit && digit < next) {
            sum += next - digit;
            s++;
        } else {
            sum += digit;
        }
    }
    return sum;
}