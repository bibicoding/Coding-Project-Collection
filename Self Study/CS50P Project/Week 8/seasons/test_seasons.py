from seasons import convert
import sys
import pytest

#test conducted on 2024-07-31
#2024 is a leap year

def test_valid():
    with pytest.raises(SystemExit):
        convert("123")
    with pytest.raises(SystemExit):
        convert("January 1st, 2003")
    with pytest.raises(SystemExit):
        convert("2003-19-34")
    with pytest.raises(SystemExit):
        convert("2028-12-12")
    with pytest.raises(SystemExit):
        convert("2022-8-1")

def test_convert():
    assert convert("2024-07-31") == "Zero minutes"
    assert convert("2023-08-01") == "Five hundred twenty-five thousand, six hundred minutes"
    assert convert("2005-09-29") == "Nine million, nine hundred seven thousand, two hundred minutes"
