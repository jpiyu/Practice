package oo ;
c l a s s Super {
S t r i n g s = " Super " ;
}
c l a s s Sub e x t e n d s Super {
S t r i n g s = " Sub " ;
}
p u b l i c c l a s s F i e l d O v e r r i d i n g {
p u b l i c s t a t i c void main ( S t r i n g [ ] a r g s ) {
Sub c1 =new Sub ( ) ;
System . out . p r i n t l n ( c1. s ) ;
Super c2 =new Sub ( ) ;
System . out . p r i n t l n ( c2. s ) ;
}
}