class Bicycle {
  int cadence;
  // int speed;
  int _speed = 0;
  int get speed => _speed;
  int gear;

  // Bicycle(this.cadence, this.speed, this.gear);

  // Bicycle(int cadence, int speed, int gear)
  //     : this.cadence = cadence,
  //       this.speed = speed,
  //       this.gear = gear;

  Bicycle(this.cadence, this.gear);

  void applyBrake(int decrement) {
    _speed -= decrement;
  }

  void speedUp(int increment) {
    _speed += increment;
  }

  @override
  String toString() => 'Bicycle: $_speed mph';
}

void main() {
  // var bike = new Bicycle(2, 0, 1);
  var bike = Bicycle(2, 1);
  print(bike);
}
