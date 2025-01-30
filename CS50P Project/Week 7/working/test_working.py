from working import convert
import pytest

def test_falseFormat():
    with pytest.raises(ValueError):
        convert("0")
    with pytest.raises(ValueError):
        convert("123123")
    with pytest.raises(ValueError):
        convert("1250-1212")
    with pytest.raises(ValueError):
        convert("12:00 AM - 15:30 PM")
    with pytest.raises(ValueError):
        convert("12:60 PM to 5:35 AM")
    with pytest.raises(ValueError):
        convert("13:70 AM to 12:10 AM")
    with pytest.raises(ValueError):
        convert("12:12 PM 5:12 AM")
    with pytest.raises(ValueError):
        convert("123:123 AM to 456:12 PM")


def test_convert():
    assert convert("12:00 AM to 3:30 PM") == "00:00 to 15:30"
    assert convert("8:00 PM to 5:30 AM") == "20:00 to 05:30"



