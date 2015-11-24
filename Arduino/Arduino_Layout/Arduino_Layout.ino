#include <Keyboard.h>

int n1 = 7;
int n2 = 6;
int n3 = 5;
int n4 = 4;
int n5 = 3;
int n6 = 2; 
int n7 = 1;
int n8 = 0;

int ipull = 8;

int led1 = 9;
int led2 = 10;

//boolean ON == false;

void setup() {
  // put your setup code here, to run once:
  pinMode(ipull, INPUT_PULLUP);
  
  pinMode(n1, INPUT);
  pinMode(n2, INPUT);
  pinMode(n3, INPUT);
  pinMode(n4, INPUT);
  pinMode(n5, INPUT);
  pinMode(n6, INPUT);
  pinMode(n7, INPUT);
  pinMode(n8, INPUT);

  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);

  Keyboard.begin();
  
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(led1, LOW);
  digitalWrite(led2, LOW);

  

  if(digitalRead(n1) == HIGH) {
    Keyboard.print('1');
    digitalWrite(led1, HIGH);
    delay(1000);
  }

  if(digitalRead(n2) == HIGH) {
    Keyboard.print('2');
    digitalWrite(led1, HIGH);
    delay(1000);
  }

  if(digitalRead(n3) == HIGH) {
    Keyboard.print('3');
    digitalWrite(led1, HIGH);
    delay(1000);
  }

  if(digitalRead(n4) == HIGH) {
    Keyboard.print('4');
    digitalWrite(led1, HIGH);
    delay(1000);
  }

//Keys for the second team

  if(digitalRead(n5) == HIGH) {
    Keyboard.print('5');
    digitalWrite(led2, HIGH);
    delay(1000);
  }

  if(digitalRead(n6) == HIGH) {
    Keyboard.print('6');
    digitalWrite(led2, HIGH);
    delay(1000);
  }

  if(digitalRead(n7) == HIGH) {
    Keyboard.print('7');
    digitalWrite(led2, HIGH);
    delay(1000);
  }

  if(digitalRead(n8) == HIGH) {
    Keyboard.print('8');
    digitalWrite(led2, HIGH);
    delay(1000);
  }

}
