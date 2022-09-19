package matrix.matrixfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainViewController implements Initializable {
//todo: calculate a 2 x 2 matrix's Eigenvalue    
    //buttons
    @FXML
    Button sumBtn;
    @FXML
    Button substractBtn;
    @FXML
    Button numMultiplyBtn;
    @FXML
    Button matrixMultiplyBtn;
    @FXML
    Button determinantBtn;
    @FXML
    Button matrixPowerBtn;
    @FXML
    Button transposeBtn;
    @FXML
    Button inverseBtn;
    @FXML
    Button identityBtn;
    @FXML
    Button EchelonBtn;
    @FXML
    Button exitBtn;
    //input fields
    // A matrix
    @FXML
    TextField aOneOne;
    @FXML
    TextField aOneTwo;
    @FXML
    TextField aOneThree;
    @FXML
    TextField aOneFour;
    @FXML
    TextField aTwoOne;
    @FXML
    TextField aTwoTwo;
    @FXML
    TextField aTwoThree;
    @FXML
    TextField aTwoFour;
    @FXML
    TextField aThreeOne;
    @FXML
    TextField aThreeTwo;
    @FXML
    TextField aThreeThree;
    @FXML
    TextField aThreeFour;
    @FXML
    TextField aFourOne;
    @FXML
    TextField aFourTwo;
    @FXML
    TextField aFourThree;
    @FXML
    TextField aFourFour;
    //B matrix    
    TextField bOneOne;
    @FXML
    TextField bOneTwo;
    @FXML
    TextField bOneThree;
    @FXML
    TextField bOneFour;
    @FXML
    TextField bTwoOne;
    @FXML
    TextField bTwoTwo;
    @FXML
    TextField bTwoThree;
    @FXML
    TextField bTwoFour;
    @FXML
    TextField bThreeOne;
    @FXML
    TextField bThreeTwo;
    @FXML
    TextField bThreeThree;
    @FXML
    TextField bThreeFour;
    @FXML
    TextField bFourOne;
    @FXML
    TextField bFourTwo;
    @FXML
    TextField bFourThree;
    @FXML
    TextField bFourFour;
    //Results matrix
    @FXML
    TextField resultOneOne;
    @FXML
    TextField resultOneTwo;
    @FXML
    TextField resultOneThree;
    @FXML
    TextField resultOneFour;
    @FXML
    TextField resultTwoOne;
    @FXML
    TextField resultTwoTwo;
    @FXML
    TextField resultTwoThree;
    @FXML
    TextField resultTwoFour;
    @FXML
    TextField resultThreeOne;
    @FXML
    TextField resultThreeTwo;
    @FXML
    TextField resultThreeThree;
    @FXML
    TextField resultThreeFour;
    @FXML
    TextField resultFourOne;
    @FXML
    TextField resultFourTwo;
    @FXML
    TextField resultFourThree;
    @FXML
    TextField resultFourFour;
    //determinant
    @FXML
    TextField determinant;
    //multiplier
    @FXML
    TextField c;

    //getting the values of A matrix, B matrix, Results matrix, the multiplier and the determinant
    //determinant
    public int getDeterminant = Integer.parseInt(determinant.getText());
    //public int setDeterminant = Integer.parseInt(determinant.setText());
    public int det;
    //multiplier
    public final int multiplier = Integer.parseInt(c.getText());
    //A matrix
    public final int a11 = Integer.parseInt(aOneOne.getText());
    public final int a12 = Integer.parseInt(aOneTwo.getText());
    public final int a13 = Integer.parseInt(aOneThree.getText());
    public final int a14 = Integer.parseInt(aOneFour.getText());
    public final int a21 = Integer.parseInt(aTwoOne.getText());
    public final int a22 = Integer.parseInt(aTwoTwo.getText());
    public final int a23 = Integer.parseInt(aTwoThree.getText());
    public final int a24 = Integer.parseInt(aTwoFour.getText());
    public final int a31 = Integer.parseInt(aThreeOne.getText());
    public final int a32 = Integer.parseInt(aThreeTwo.getText());
    public final int a33 = Integer.parseInt(aThreeThree.getText());
    public final int a34 = Integer.parseInt(aThreeFour.getText());
    public final int a41 = Integer.parseInt(aFourOne.getText());
    public final int a42 = Integer.parseInt(aFourTwo.getText());
    public final int a43 = Integer.parseInt(aFourThree.getText());
    public final int a44 = Integer.parseInt(aFourFour.getText());
    //B matrix
    public final int b11 = Integer.parseInt(bOneOne.getText());
    public final int b12 = Integer.parseInt(bOneTwo.getText());
    public final int b13 = Integer.parseInt(bOneThree.getText());
    public final int b14 = Integer.parseInt(bOneFour.getText());
    public final int b21 = Integer.parseInt(bTwoOne.getText());
    public final int b22 = Integer.parseInt(bTwoTwo.getText());
    public final int b23 = Integer.parseInt(bTwoThree.getText());
    public final int b24 = Integer.parseInt(bTwoFour.getText());
    public final int b31 = Integer.parseInt(bThreeOne.getText());
    public final int b32 = Integer.parseInt(bThreeTwo.getText());
    public final int b33 = Integer.parseInt(bThreeThree.getText());
    public final int b34 = Integer.parseInt(bThreeFour.getText());
    public final int b41 = Integer.parseInt(bFourOne.getText());
    public final int b42 = Integer.parseInt(bFourTwo.getText());
    public final int b43 = Integer.parseInt(bFourThree.getText());
    public final int b44 = Integer.parseInt(bFourFour.getText());
    //Results matrix
    public int getResult11 = Integer.parseInt(resultOneOne.getText());
    public int getResult12 = Integer.parseInt(resultOneTwo.getText());
    public int getResult13 = Integer.parseInt(resultOneThree.getText());
    public int getResult14 = Integer.parseInt(resultOneFour.getText());
    public int getResult21 = Integer.parseInt(resultTwoOne.getText());
    public int getResult22 = Integer.parseInt(resultTwoTwo.getText());
    public int getResult23 = Integer.parseInt(resultTwoThree.getText());
    public int getResult24 = Integer.parseInt(resultTwoFour.getText());
    public int getResult31 = Integer.parseInt(resultThreeOne.getText());
    public int getResult32 = Integer.parseInt(resultThreeTwo.getText());
    public int getResult33 = Integer.parseInt(resultThreeThree.getText());
    public int getResult34 = Integer.parseInt(resultThreeFour.getText());
    public int getResult41 = Integer.parseInt(resultFourOne.getText());
    public int getResult42 = Integer.parseInt(resultFourTwo.getText());
    public int getResult43 = Integer.parseInt(resultFourThree.getText());
    public int getResult44 = Integer.parseInt(resultFourFour.getText());

     int[] aMatrix = {a11, a12, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};
     int[] bMatrix = {b11, b12, b13, b14, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
    final int aLength = aMatrix.length;
    final int bLength = bMatrix.length;
    boolean isSquare = false;

    byte whichMatrix;

    //matrix calculations
    //done
    private void calculateSum() {
        //to add two matrices, just add the numbers in the same place (c11 = a11 + b11 c13= a13 + b13)
        //check if A and B matrix are the same size
            if ((a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)
                ) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Both matrix must be full!");
            alert.showAndWait();
        } else if ( //check if A matrix has no value, but B has
                (a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && !(b11 == 0 && b12 == 0)
                && !(b13 == 0 && b14 == 0)
                && !(b21 == 0 && b22 == 0)
                && !(b23 == 0 && b24 == 0)
                && !(b31 == 0 && b32 == 0)
                && !(b33 == 0 && b34 == 0)
                && !(b41 == 0 && b42 == 0)
                && !(b43 == 0 && b44 == 0)) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("A matrix must be full!");
            alert.showAndWait();
        } else if ( //check if B matrix is empty, but A has
                (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)
                && !(a11 == 0 && a12 == 0)
                && !(a13 == 0 && a14 == 0)
                && !(a21 == 0 && a22 == 0)
                && !(a23 == 0 && a24 == 0)
                && !(a31 == 0 && a32 == 0)
                && !(a33 == 0 && a34 == 0)
                && !(a41 == 0 && a42 == 0)
                && !(a43 == 0 && a44 == 0)
                ) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("B matrix must be full!");
            alert.showAndWait();
        } else if //check if A and B matrix are the same size
                (
                a11 == 0
                ) {
            int[] aMatrixModified = {a12, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();
            
        }else if (a12 == 0) {
            int[] aMatrixModified = {a11, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();
        }else if (a13 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();
        }else if 
                (
                a14 == 0
                ) {
            int[] aMatrixModified = {a12, a13, a11, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
            
        }else if (a21 == 0) {
            int[] aMatrixModified = {a11, a13, a14, a12, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if (a22 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a13, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if 
                (
                a23 == 0
                ) {
            int[] aMatrixModified = {a12, a13, a14, a21, a22, a11, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
            
        }else if (a24 == 0) {
            int[] aMatrixModified = {a11, a13, a14, a21, a22, a23, a12, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if (a31 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a22, a23, a24, a13, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if //check if A and B matrix are the same size
                (
                a32 == 0
                ) {
            int[] aMatrixModified = {a12, a13, a14, a21, a22, a23, a24, a31, a11, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
            
        }else if (a33 == 0) {
            int[] aMatrixModified = {a11, a13, a14, a21, a22, a23, a24, a31, a32, a12, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if (a34 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a22, a23, a24, a31, a32, a33, a13, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if 
                (
                a41 == 0
                ) {
            int[] aMatrixModified = {a12, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a11, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
            
        }else if (a42 == 0) {
            int[] aMatrixModified = {a11, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a12, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if (a43 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a13, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if (a44 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a13, a43};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
                } else if //check if A and B matrix are the same size
                (
                b11 == 0
                ) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();
            
        }else if (b12 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b11, b13, b14, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();
        }else if (b13 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b11, b12, b13, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();
        }else if 
                (
                b14 == 0
                ) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b11, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
            
        }else if (b21 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b11, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if (b22 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b11, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if 
                (
                b23 == 0
                ) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
            
        }else if (b24 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b23, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if (b31 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b23, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if 
                (
                b32 == 0
                ) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b23, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
            
        }else if (b33 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b23, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if (b34 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b23, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if 
                (
                b41 == 0
                ) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b34, b23, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
            
        }else if (b42 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b34, b41, b23, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if (b43 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b34, b41, b42, b23, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if (b44 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b34, b41, b42, b43, b23};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait(); 
        }else{
            int setResult11 = a11 + b11;
            int setResult12 = a12 + b12;
            int setResult13 = a13 + b13;
            int setResult14 = a14 + b14;
            int setResult21 = a21 + b21;
            int setResult22 = a22 + b22;
            int setResult23 = a23 + b23;
            int setResult24 = a24 + b24;
            int setResult31 = a31 + b31;
            int setResult32 = a32 + b32;
            int setResult33 = a33 + b33;
            int setResult34 = a34 + b34;
            int setResult41 = a41 + b41;
            int setResult42 = a42 + b42;
            int setResult43 = a43 + b43;
            int setResult44 = a44 + b44;
            //displaying the results
                resultOneOne.setText(Integer.toString(setResult11));
                resultOneTwo.setText(Integer.toString(setResult12));
                resultOneThree.setText(Integer.toString(setResult13));
                resultOneFour.setText(Integer.toString(setResult14));
                resultTwoOne.setText(Integer.toString(setResult21));
                resultTwoTwo.setText(Integer.toString(setResult22));
                resultTwoThree.setText(Integer.toString(setResult23));
                resultTwoFour.setText(Integer.toString(setResult24));
                resultThreeOne.setText(Integer.toString(setResult31));
                resultThreeTwo.setText(Integer.toString(setResult32));
                resultThreeThree.setText(Integer.toString(setResult33));
                resultThreeFour.setText(Integer.toString(setResult34));
                resultFourOne.setText(Integer.toString(setResult41));
                resultFourTwo.setText(Integer.toString(setResult42));
                resultFourThree.setText(Integer.toString(setResult43));
                resultFourFour.setText(Integer.toString(setResult44)); 
        }
        
    }
    //done
    private void calculateSubstract() {
        //to substract two matrices, just substract the numbers in the same place (c11 = a11 - b11 c13= a13 - b13)
        //check if A and B matrix are the same size
        //alert the user if both (A and B matrix) are empty
        if ((a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)
                ) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Both matrix must be full!");
            alert.showAndWait();
        } else if ( //check if A matrix has no value, but B has
                (a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && !(b11 == 0 && b12 == 0)
                && !(b13 == 0 && b14 == 0)
                && !(b21 == 0 && b22 == 0)
                && !(b23 == 0 && b24 == 0)
                && !(b31 == 0 && b32 == 0)
                && !(b33 == 0 && b34 == 0)
                && !(b41 == 0 && b42 == 0)
                && !(b43 == 0 && b44 == 0)) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("A matrix must be full!");
            alert.showAndWait();
        } else if ( //check if B matrix is empty, but A has
                (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)
                && !(a11 == 0 && a12 == 0)
                && !(a13 == 0 && a14 == 0)
                && !(a21 == 0 && a22 == 0)
                && !(a23 == 0 && a24 == 0)
                && !(a31 == 0 && a32 == 0)
                && !(a33 == 0 && a34 == 0)
                && !(a41 == 0 && a42 == 0)
                && !(a43 == 0 && a44 == 0)
                ) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("B matrix must be full!");
            alert.showAndWait();
        } else if //check if A and B matrix are the same size
                (
                a11 == 0
                ) {
            int[] aMatrixModified = {a12, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();
            
        }else if (a12 == 0) {
            int[] aMatrixModified = {a11, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();
        }else if (a13 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();
        }else if 
                (
                a14 == 0
                ) {
            int[] aMatrixModified = {a12, a13, a11, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
            
        }else if (a21 == 0) {
            int[] aMatrixModified = {a11, a13, a14, a12, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if (a22 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a13, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if 
                (
                a23 == 0
                ) {
            int[] aMatrixModified = {a12, a13, a14, a21, a22, a11, a24, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
            
        }else if (a24 == 0) {
            int[] aMatrixModified = {a11, a13, a14, a21, a22, a23, a12, a31, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if (a31 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a22, a23, a24, a13, a32, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if //check if A and B matrix are the same size
                (
                a32 == 0
                ) {
            int[] aMatrixModified = {a12, a13, a14, a21, a22, a23, a24, a31, a11, a33, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
            
        }else if (a33 == 0) {
            int[] aMatrixModified = {a11, a13, a14, a21, a22, a23, a24, a31, a32, a12, a34, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if (a34 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a22, a23, a24, a31, a32, a33, a13, a41, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if 
                (
                a41 == 0
                ) {
            int[] aMatrixModified = {a12, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a11, a42, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
            
        }else if (a42 == 0) {
            int[] aMatrixModified = {a11, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a12, a43, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if (a43 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a13, a44};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
        }else if (a44 == 0) {
            int[] aMatrixModified = {a11, a12, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a13, a43};  
            int[] bMatrixModified = bMatrix;
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("A matrix isn't as large/small as B matrix!");
                alert.showAndWait();            
                } else if //check if A and B matrix are the same size
                (
                b11 == 0
                ) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();
            
        }else if (b12 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b11, b13, b14, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();
        }else if (b13 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b11, b12, b13, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();
        }else if 
                (
                b14 == 0
                ) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b11, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
            
        }else if (b21 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b11, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if (b22 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b11, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if 
                (
                b23 == 0
                ) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
            
        }else if (b24 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b23, b31, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if (b31 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b23, b32, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if 
                (
                b32 == 0
                ) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b23, b33, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
            
        }else if (b33 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b23, b34, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if (b34 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b23, b41, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if 
                (
                b41 == 0
                ) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b34, b23, b42, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
            
        }else if (b42 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b34, b41, b23, b43, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if (b43 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b34, b41, b42, b23, b44};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait();            
        }else if (b44 == 0) {
            int[] aMatrixModified = aMatrix;  
            int[] bMatrixModified = { b12, b13, b14, b21, b22, b11, b24, b31, b32, b33, b34, b41, b42, b43, b23};
            int aLengthModified = aMatrixModified.length;
            int bLemgthModified = bMatrixModified.length;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("B matrix isn't as large/small as A matrix!");
                alert.showAndWait(); 
        }else{
            int setResult11 = a11 - b11;
            int setResult12 = a12 - b12;
            int setResult13 = a13 - b13;
            int setResult14 = a14 - b14;
            int setResult21 = a21 - b21;
            int setResult22 = a22 - b22;
            int setResult23 = a23 - b23;
            int setResult24 = a24 - b24;
            int setResult31 = a31 - b31;
            int setResult32 = a32 - b32;
            int setResult33 = a33 - b33;
            int setResult34 = a34 - b34;
            int setResult41 = a41 - b41;
            int setResult42 = a42 - b42;
            int setResult43 = a43 - b43;
            int setResult44 = a44 - b44;
            //displaying the results
                resultOneOne.setText(Integer.toString(setResult11));
                resultOneTwo.setText(Integer.toString(setResult12));
                resultOneThree.setText(Integer.toString(setResult13));
                resultOneFour.setText(Integer.toString(setResult14));
                resultTwoOne.setText(Integer.toString(setResult21));
                resultTwoTwo.setText(Integer.toString(setResult22));
                resultTwoThree.setText(Integer.toString(setResult23));
                resultTwoFour.setText(Integer.toString(setResult24));
                resultThreeOne.setText(Integer.toString(setResult31));
                resultThreeTwo.setText(Integer.toString(setResult32));
                resultThreeThree.setText(Integer.toString(setResult33));
                resultThreeFour.setText(Integer.toString(setResult34));
                resultFourOne.setText(Integer.toString(setResult41));
                resultFourTwo.setText(Integer.toString(setResult42));
                resultFourThree.setText(Integer.toString(setResult43));
                resultFourFour.setText(Integer.toString(setResult44)); 
        }
        
    }
    //done
    private void calculateMultiplyNum() {
        //to multiply a matrix (ONLY ONE), just multiply the elements of the matrix with the multiplier (A11 = c * a11 A13 = c * a13)
        //check which matrix is not empty

        if ( //A matrix is empty, B matrix isn't
                (a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && !(b11 == 0 && b12 == 0)
                && !(b13 == 0 && b14 == 0)
                && !(b21 == 0 && b22 == 0)
                && !(b23 == 0 && b24 == 0)
                && !(b31 == 0 && b32 == 0)
                && !(b33 == 0 && b34 == 0)
                && !(b41 == 0 && b42 == 0)
                && !(b43 == 0 && b44 == 0)
                ) {
            whichMatrix = 1;
        } else if (//check if B matrix has value, A matrix is empty
                !(a11 == 0 && a12 == 0)
                && !(a13 == 0 && a14 == 0)
                && !(a21 == 0 && a22 == 0)
                && !(a23 == 0 && a24 == 0)
                && !(a31 == 0 && a32 == 0)
                && !(a33 == 0 && a34 == 0)
                && !(a41 == 0 && a42 == 0)
                && !(a43 == 0 && a44 == 0)
                && (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)) {
            whichMatrix = 2;
        }
        switch (whichMatrix) {
            case 1:
                //calculat A matrix * c 
                int setResultA11 = a11 * multiplier;
                int setResultA12 = a12 * multiplier;
                int setResultA13 = a13 * multiplier;
                int setResultA14 = a14 * multiplier;
                int setResultA21 = a21 * multiplier;
                int setResultA22 = a22 * multiplier;
                int setResultA23 = a23 * multiplier;
                int setResultA24 = a24 * multiplier;
                int setResultA31 = a31 * multiplier;
                int setResultA32 = a32 * multiplier;
                int setResultA33 = a33 * multiplier;
                int setResultA34 = a34 * multiplier;
                int setResultA41 = a41 * multiplier;
                int setResultA42 = a42 * multiplier;
                int setResultA43 = a43 * multiplier;
                int setResultA44 = a44 * multiplier;
                //displaying the results
                resultOneOne.setText(Integer.toString(setResultA11));
                resultOneTwo.setText(Integer.toString(setResultA12));
                resultOneThree.setText(Integer.toString(setResultA13));
                resultOneFour.setText(Integer.toString(setResultA14));
                resultTwoOne.setText(Integer.toString(setResultA21));
                resultTwoTwo.setText(Integer.toString(setResultA22));
                resultTwoThree.setText(Integer.toString(setResultA23));
                resultTwoFour.setText(Integer.toString(setResultA24));
                resultThreeOne.setText(Integer.toString(setResultA31));
                resultThreeTwo.setText(Integer.toString(setResultA32));
                resultThreeThree.setText(Integer.toString(setResultA33));
                resultThreeFour.setText(Integer.toString(setResultA34));
                resultFourOne.setText(Integer.toString(setResultA41));
                resultFourTwo.setText(Integer.toString(setResultA42));
                resultFourThree.setText(Integer.toString(setResultA43));
                resultFourFour.setText(Integer.toString(setResultA44)); 
                break;
            case 2:
                //calculate B matrix * c
                int setResultB11 = b11 * multiplier;
                int setResultB12 = b12 * multiplier;
                int setResultB13 = b13 * multiplier;
                int setResultB14 = b14 * multiplier;
                int setResultB21 = b21 * multiplier;
                int setResultB22 = b22 * multiplier;
                int setResultB23 = b23 * multiplier;
                int setResultB24 = b24 * multiplier;
                int setResultB31 = b31 * multiplier;
                int setResultB32 = b32 * multiplier;
                int setResultB33 = b33 * multiplier;
                int setResultB34 = b34 * multiplier;
                int setResultB41 = b41 * multiplier;
                int setResultB42 = b42 * multiplier;
                int setResultB43 = b43 * multiplier;
                int setResultB44 = b44 * multiplier;
                //displaying the results
                resultOneOne.setText(Integer.toString(setResultB11));
                resultOneTwo.setText(Integer.toString(setResultB12));
                resultOneThree.setText(Integer.toString(setResultB13));
                resultOneFour.setText(Integer.toString(setResultB14));
                resultTwoOne.setText(Integer.toString(setResultB21));
                resultTwoTwo.setText(Integer.toString(setResultB22));
                resultTwoThree.setText(Integer.toString(setResultB23));
                resultTwoFour.setText(Integer.toString(setResultB24));
                resultThreeOne.setText(Integer.toString(setResultB31));
                resultThreeTwo.setText(Integer.toString(setResultB32));
                resultThreeThree.setText(Integer.toString(setResultB33));
                resultThreeFour.setText(Integer.toString(setResultB34));
                resultFourOne.setText(Integer.toString(setResultB41));
                resultFourTwo.setText(Integer.toString(setResultB42));
                resultFourThree.setText(Integer.toString(setResultB43));
                resultFourFour.setText(Integer.toString(setResultB44));                 
                break;
            default:
                //both A and B matrices are empty OR full 
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("Only one Matrix can be multipled with given number! Add values to One Matrix!");
                alert.showAndWait();
        }
        //check if both matrices are empty or full. If it's true then alert the user
        //both are empty    
        if ((a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Only one Matrix can be multipled with given number!");
            alert.showAndWait();
        } else if ( //both are full
                !(a11 == 0 && a12 == 0)
                && !(a13 == 0 && a14 == 0)
                && !(a21 == 0 && a22 == 0)
                && !(a23 == 0 && a24 == 0)
                && !(a31 == 0 && a32 == 0)
                && !(a33 == 0 && a34 == 0)
                && !(a41 == 0 && a42 == 0)
                && !(a43 == 0 && a44 == 0)
                && !(b11 == 0 && b12 == 0)
                && !(b13 == 0 && b14 == 0)
                && !(b21 == 0 && b22 == 0)
                && !(b23 == 0 && b24 == 0)
                && !(b31 == 0 && b32 == 0)
                && !(b33 == 0 && b34 == 0)
                && !(b41 == 0 && b42 == 0)
                && !(b43 == 0 && b44 == 0)) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Only one Matrix can be multipled with given number!");
            alert.showAndWait();
        }
    }
    //done
    private void calculatePower() {
        //to calculate a matrix's power we need the matrix (A or B), and the number we need to take the matrix to the power of.
        //the multiplier's amount will be used
        //check which matrix (A or B) is empty
        //check if A matrix and B matrix are square matrix (rowCount == colCount)
 if ( //A matrix is empty, B matrix isn't
                (a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && !(b11 == 0 && b12 == 0)
                && !(b13 == 0 && b14 == 0)
                && !(b21 == 0 && b22 == 0)
                && !(b23 == 0 && b24 == 0)
                && !(b31 == 0 && b32 == 0)
                && !(b33 == 0 && b34 == 0)
                && !(b41 == 0 && b42 == 0)
                && !(b43 == 0 && b44 == 0)
                ) {
            whichMatrix = 1;
        } else if (//check if B matrix has value, A matrix is empty
                !(a11 == 0 && a12 == 0)
                && !(a13 == 0 && a14 == 0)
                && !(a21 == 0 && a22 == 0)
                && !(a23 == 0 && a24 == 0)
                && !(a31 == 0 && a32 == 0)
                && !(a33 == 0 && a34 == 0)
                && !(a41 == 0 && a42 == 0)
                && !(a43 == 0 && a44 == 0)
                && (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)) {
            whichMatrix = 2;
        }//both are empty 
           else if ((a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)
) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Both matrices are empty!");
            alert.showAndWait();
} else if(
                //both are full
                !(a11 == 0 && a12 == 0)
                && !(a13 == 0 && a14 == 0)
                && !(a21 == 0 && a22 == 0)
                && !(a23 == 0 && a24 == 0)
                && !(a31 == 0 && a32 == 0)
                && !(a33 == 0 && a34 == 0)
                && !(a41 == 0 && a42 == 0)
                && !(a43 == 0 && a44 == 0)
                && !(b11 == 0 && b12 == 0)
                && !(b13 == 0 && b14 == 0)
                && !(b21 == 0 && b22 == 0)
                && !(b23 == 0 && b24 == 0)
                && !(b31 == 0 && b32 == 0)
                && !(b33 == 0 && b34 == 0)
                && !(b41 == 0 && b42 == 0)
                && !(b43 == 0 && b44 == 0)
        ){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Both matrices are full!");
            alert.showAndWait();    
}//check if A matrix is square matrix (rowCount == colCount)
else if (whichMatrix == 2 && 
        !(a11 == 0 && a12 == 0) 
        && !(a21 == 0 && a22 == 0) 
        && !(a11 == 0 && a12 == 0 && a13 == 0)
        && !(a21 == 0 && a22 == 0 && a23 == 0)
        && !(a31 == 0 && a32 == 0 && a33 == 0)
        ) {
        isSquare = true;
        double setResultA11 = Math.pow(a11, getDeterminant);
        double setResultA12 = Math.pow(a12, getDeterminant);
        double setResultA13 = Math.pow(a13, getDeterminant);
        double setResultA21 = Math.pow(a21, getDeterminant);
        double setResultA22 = Math.pow(a22, getDeterminant);
        double setResultA23 = Math.pow(a23, getDeterminant);
        double setResultA31 = Math.pow(a31, getDeterminant);
        double setResultA32 = Math.pow(a32, getDeterminant);
        double setResultA33 = Math.pow(a33, getDeterminant);
        resultOneOne.setText(Double.toString(setResultA11));
        resultOneTwo.setText(Double.toString(setResultA12));
        resultOneThree.setText(Double.toString(setResultA13));
        resultTwoOne.setText(Double.toString(setResultA21));
        resultTwoTwo.setText(Double.toString(setResultA22));
        resultTwoThree.setText(Double.toString(setResultA23));
        resultThreeOne.setText(Double.toString(setResultA31));
        resultThreeTwo.setText(Double.toString(setResultA32));
        resultThreeThree.setText(Double.toString(setResultA33));    
    }else if (whichMatrix == 1 && 
        !(b11 == 0 && b12 == 0) 
        && !(b21 == 0 && b22 == 0) 
        && !(b11 == 0 && b12 == 0 && b13 == 0)
        && !(b21 == 0 && b22 == 0 && b23 == 0)
        && !(b31 == 0 && b32 == 0 && b33 == 0)) {
       isSquare = true;
        double setResultB11 = Math.pow(b11, getDeterminant);
        double setResultB12 = Math.pow(b12, getDeterminant);
        double setResultB13 = Math.pow(b13, getDeterminant);
        double setResultB21 = Math.pow(b21, getDeterminant);
        double setResultB22 = Math.pow(b22, getDeterminant);
        double setResultB23 = Math.pow(b23, getDeterminant);
        double setResultB31 = Math.pow(b31, getDeterminant);
        double setResultB32 = Math.pow(b32, getDeterminant);
        double setResultB33 = Math.pow(b33, getDeterminant);
        resultOneOne.setText(Double.toString(setResultB11));
        resultOneTwo.setText(Double.toString(setResultB12));
        resultOneThree.setText(Double.toString(setResultB13));
        resultTwoOne.setText(Double.toString(setResultB21));
        resultTwoTwo.setText(Double.toString(setResultB22));
        resultTwoThree.setText(Double.toString(setResultB23));
        resultThreeOne.setText(Double.toString(setResultB31));
        resultThreeTwo.setText(Double.toString(setResultB32));
        resultThreeThree.setText(Double.toString(setResultB33));      
    }
        else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Only a square matrix (RowCount and ColumnCount are equal) can be taken to the power of the given number!");
            alert.showAndWait();
             }
    }
    //done
    private void calculateMultiplyMatrix() {
        //Multiplying two (or more) matrices is more involved than multiplying by a scalar. 
        //In order to multiply two matrices, the number of columns in the first matrix must match the number of rows in the second matrix. 
        //For example, you can multiply a 2 × 3 matrix by a 3 × 4 matrix, but not a 2 × 3 matrix by a 4 × 3.
        //you can calculate a 2 x 3 matrix and a 3 x 4 matrix'  multiplication which will be a 3 x 3 matrix (rowCount == 2 && colCount == 2 || rowCount == 3 && colCount == 3)
        //check if the operation is doable
        //if A rowCount == B colCount then doable
        //A matrix is 2 x 3: a11, a12, a13, a21, a22, a23 are not empty. 
        //B matrix is a 3 x 4: b11, b12, b13, b14, b21, b22, b23, b24, b31, b32, b33, b34,
        //the Result Matrix will be a 2 x 3 
        if (
                !(a11 == 0 && a12 == 0) 
                && !(a13 == 0 && a21 == 0) 
                && !(a22 == 0 && a23 == 0)
                && !(b11 == 0 && b12 == 0)
                && !(b13 == 0 && b14 == 0)
                && !(b21 == 0 && b22 == 0)
                && !(b23 == 0 && b24 == 0)
                && !(b31 == 0 && b32 == 0)
                && !(b33 == 0 && b34 == 0)                
                ) {
            int setResult11 = (a11 * b11) + (a12 * b21) +(a13 * b31);
            int setResult12 = (a11 * b12) + (a12 * b22) + (a13 * b32);
            int setResult13 = (a11 * b13) + (a12 * b23) + (a13 * b33);
            int setResult21 = (a21 * b11) + (a22 * b21) + (a23 * b31);
            int setResult22 = (a21 * b12) + (a22 * b22) + (a23 * b32);
            int setResult23 = (a21 * b13) + (a22 * b23) + (a23 * b33);
            resultOneOne.setText(Integer.toString(setResult11));
            resultOneTwo.setText(Integer.toString(setResult12));
            resultOneThree.setText(Integer.toString(setResult13));
            resultTwoOne.setText(Integer.toString(setResult21));
            resultTwoTwo.setText(Integer.toString(setResult22));
            resultTwoThree.setText(Integer.toString(setResult23));
        }else {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("The operation cannot be done!");
                alert.showAndWait();
                }
  
            }        
    //done
    private void calculateDeterminant() {
        //The determinant of a matrix is a value that can be computed from the elements of a square matrix. 
        //It is used in linear algebra, calculus, and other mathematical contexts. 
        //For example, the determinant can be used to compute the inverse of a matrix or to solve a system of linear equations.
        //There are a number of methods and formulas for calculating the determinant of a matrix. 
        //The Leibniz formula and the Laplace formula are two commonly used formulas.
        //check which matrix is not empty
        if (true) {

        } else {
            //if both are empty or both are full alert the user    
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Only one Matrix's determinant can be calculated!");
            alert.showAndWait();
        }//check if A matrix and/or B matrix is/are square matrix/matrices
        if ( //A matrix is empty, B matrix isn't
                (a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && !(b11 == 0 && b12 == 0)
                && !(b13 == 0 && b14 == 0)
                && !(b21 == 0 && b22 == 0)
                && !(b23 == 0 && b24 == 0)
                && !(b31 == 0 && b32 == 0)
                && !(b33 == 0 && b34 == 0)
                && !(b41 == 0 && b42 == 0)
                && !(b43 == 0 && b44 == 0)
                ) {
            whichMatrix = 1;
        } else if (//check if B matrix has value, A matrix is empty
                !(a11 == 0 && a12 == 0)
                && !(a13 == 0 && a14 == 0)
                && !(a21 == 0 && a22 == 0)
                && !(a23 == 0 && a24 == 0)
                && !(a31 == 0 && a32 == 0)
                && !(a33 == 0 && a34 == 0)
                && !(a41 == 0 && a42 == 0)
                && !(a43 == 0 && a44 == 0)
                && (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)) {
            whichMatrix = 2;
        }
        //if both empty alert the user
        //2 x 2 martix's determinant
        //check which matrix is full, and only calculate that matrix's determinant
        switch (whichMatrix) {
            case 1:
                if (aMatrix.length == 4) {
                    det = (a11 - a22) * (a12 - a21);
                    String detHelper = Integer.toString(det);
                    String setDet = detHelper;
                    determinant.setText(setDet);
                }else if (aMatrix.length == 9) {
                det = (a11 * a22 * a33) + (a12 * a23 * a31) + (a13 * a21 * a32) - (a13 * a22 * a31) - (a12 * a21 * a33) - (a11 * a23 * a32);
                String detHelper = Integer.toString(det);
                String setDet = detHelper;
                determinant.setText(setDet);
                }
                break;
            case 2:
                 if (bMatrix.length == 4) {
                    det = (b11 - b22) * (b12 - b21);
                    String detHelper = Integer.toString(det);
                    String setDet = detHelper;
                    determinant.setText(setDet);
                }else if (aMatrix.length == 9) {
                det = (b11 * b22 * b33) + (b12 * b23 * b31) + (b13 * b21 * b32) - (b13 * b22 * b31) - (b12 * b21 * b33) - (b11 * b23 * b32);
                String detHelper = Integer.toString(det);
                String setDet = detHelper;
                determinant.setText(setDet);
                }
                break;
            default:
           //alert the user that the matrix's determinant cannot be calculated
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("The matrix's determinant cannot be calculated!");
            alert.showAndWait();
        }
    }
    //done
    private void calculateTranspose() {
        //The transpose of a matrix, typically indicated with a "T" as an exponent, is an operation that flips a matrix over its diagonal. 
        //This results in switching the row and column indices of a matrix
        //check if the matrix is not empty
       if ( //A matrix is empty, B matrix isn't
                (a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && !(b11 == 0 && b12 == 0)
                && !(b13 == 0 && b14 == 0)
                && !(b21 == 0 && b22 == 0)
                && !(b23 == 0 && b24 == 0)
                && !(b31 == 0 && b32 == 0)
                && !(b33 == 0 && b34 == 0)
                && !(b41 == 0 && b42 == 0)
                && !(b43 == 0 && b44 == 0)
                ) {
            whichMatrix = 1;
        } else if (//check if B matrix has value, A matrix is empty
                !(a11 == 0 && a12 == 0)
                && !(a13 == 0 && a14 == 0)
                && !(a21 == 0 && a22 == 0)
                && !(a23 == 0 && a24 == 0)
                && !(a31 == 0 && a32 == 0)
                && !(a33 == 0 && a34 == 0)
                && !(a41 == 0 && a42 == 0)
                && !(a43 == 0 && a44 == 0)
                && (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)) {
            whichMatrix = 2;
        } else if ((a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)) {
                        //alert the user that empty matrix has no transpose
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Empty matrix has no transpose!");
            alert.showAndWait();
        }else
 {
            //alert the user that only one matrix's transpose can be calculated
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Both matrices are full!");
            alert.showAndWait();
        }
switch (whichMatrix) {
            case 1:
                //calculate A matrix's transpose
                //flip the matrix
                //swich the row and column
                resultOneOne.setText(Integer.toString(a11));
                resultOneTwo.setText(Integer.toHexString(a21));
                resultOneThree.setText(Integer.toString(a31));
                resultOneFour.setText(Integer.toString(a41));
                resultTwoOne.setText(Integer.toString(a21));
                resultThreeTwo.setText(Integer.toString(a22));
                resultTwoThree.setText(Integer.toString(a32));
                resultTwoFour.setText(Integer.toString(a42));
                resultThreeOne.setText(Integer.toString(a13));
                resultThreeTwo.setText(Integer.toHexString(a23));
                resultThreeThree.setText(Integer.toString(a33));
                resultThreeFour.setText(Integer.toString(a43));
                resultFourOne.setText(Integer.toString(a14));
                resultFourTwo.setText(Integer.toString(a24));
                resultFourThree.setText(Integer.toString(a34));
                resultFourFour.setText(Integer.toString(a44));                
                break;
            case 2:
                //calculate B matrix's transpose
                //flip the matrix
                resultOneOne.setText(Integer.toString(b11));
                resultOneTwo.setText(Integer.toHexString(b21));
                resultOneThree.setText(Integer.toString(b31));
                resultOneFour.setText(Integer.toString(b41));
                resultTwoOne.setText(Integer.toString(b21));
                resultThreeTwo.setText(Integer.toString(b22));
                resultTwoThree.setText(Integer.toString(b32));
                resultTwoFour.setText(Integer.toString(b42));
                resultThreeOne.setText(Integer.toString(b13));
                resultThreeTwo.setText(Integer.toHexString(b23));
                resultThreeThree.setText(Integer.toString(b33));
                resultThreeFour.setText(Integer.toString(b43));
                resultFourOne.setText(Integer.toString(b14));
                resultFourTwo.setText(Integer.toString(b24));
                resultFourThree.setText(Integer.toString(b34));
                resultFourFour.setText(Integer.toString(b44));                  
                break;
            default:
                //by default (both are empty or full) the calculation cannot be done
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("Only one Matrix's transpose can be calculated!");
                alert.showAndWait();
    }
    }
    //done
    private void calculateInverse() {
        //The inverse of a matrix A is denoted as A-1, where A-1 is the inverse of A if the following is true:
        //A×A-1 = A-1×A = I, where I is the identity matrix
        //check which matrix is not empty
        int det2X2 = (a11 * a22) - (a12 * a21);
        if (
                //check if A matrix has no value
                (a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && !(b11 == 0 && b12 == 0)
                && !(b13 == 0 && b14 == 0)
                && !(b21 == 0 && b22 == 0)
                && !(b23 == 0 && b24 == 0)
                && !(b31 == 0 && b32 == 0)
                && !(b33 == 0 && b34 == 0)
                && !(b41 == 0 && b42 == 0)
                && !(b43 == 0 && b44 == 0)
) {
        whichMatrix = 1;
        } else if (
                   //check if B matrix has no value
                (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)
                && !(a11 == 0 && a12 == 0)
                && !(a13 == 0 && a14 == 0)
                && !(a21 == 0 && a22 == 0)
                && !(a23 == 0 && a24 == 0)
                && !(a31 == 0 && a32 == 0)
                && !(a33 == 0 && a34 == 0)
                && !(a41 == 0 && a42 == 0)
                && !(a43 == 0 && a44 == 0)
)
{
   whichMatrix = 2;
}
        switch (whichMatrix) {
            case 1:
                //calculate A matrix's inversematrix
               //A * A-1 = I
                
                break;
            case 2:
                //calculate B matrix's inversematrix
                
                break;
            default:
                //both matrices are full
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error!");
                alert.setContentText("Operation cannot be done!");
                alert.showAndWait();

    }
        
        //if both matrices are empty alert the user
        if ((a11 == 0 && a12 == 0)
                && (a13 == 0 && a14 == 0)
                && (a21 == 0 && a22 == 0)
                && (a23 == 0 && a24 == 0)
                && (a31 == 0 && a32 == 0)
                && (a33 == 0 && a34 == 0)
                && (a41 == 0 && a42 == 0)
                && (a43 == 0 && a44 == 0)
                && (b11 == 0 && b12 == 0)
                && (b13 == 0 && b14 == 0)
                && (b21 == 0 && b22 == 0)
                && (b23 == 0 && b24 == 0)
                && (b31 == 0 && b32 == 0)
                && (b33 == 0 && b34 == 0)
                && (b41 == 0 && b42 == 0)
                && (b43 == 0 && b44 == 0)) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Empty matrix has no inverse!");
            alert.showAndWait();
        }

        //only a 2 x 2 or a 3 x 3 matrix's inverse can be calculated
        //only a 2 x 2 matrix's inverse will be calculated due to computing complexity
        if (!(a11 == 0 && a12 == 0) 
                && !(a21 == 0 
                && a22 == 0) 
                && aLength == 4
                && !((a11 * a22) - (a12 * a21) == 0) ) {
        //calculate A matrix's inverse
         resultOneOne.setText(Integer.toString(a11 / det2X2));
         resultOneTwo.setText(Integer.toString(a12 / det2X2));
         resultTwoOne.setText(Integer.toString(a21 / det2X2));
         resultTwoTwo.setText(Integer.toString(a22 / det2X2));
        }  else if (!(b11 == 0 && b12 == 0) 
                && !(b21 == 0 && b22 == 0) 
                && bLength == 4
                && !((b11 * b22) - (b12 * b21) == 0)) {
            //calculate B matrix's inverse
         resultOneOne.setText(Integer.toString(b11 / det2X2));
         resultOneTwo.setText(Integer.toString(b12 / det2X2));
         resultTwoOne.setText(Integer.toString(b21 / det2X2));
         resultTwoTwo.setText(Integer.toString(b22 / det2X2));
        } 
        else {
            //alert the user that the inverse cannot be calculated
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Only a 2 x 2 Or a 3 x 3 matrix's inverse can be calculated!");
            alert.showAndWait();
        }
    }
    //done
    private void calculateReducedRowEchelon(){
        //calculates the Reduced Row Echelon Form of a matrix or Row Echelon Form of a martix.
        //the program will randomly choose which Echelon Form will be calculated
        //only one Matrix's Form(s) can be calculated
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Unsupported at the moment!");
            alert.showAndWait();
    }
    //done
    private void calculateIdentity() {
        //The identity matrix is a square matrix with "1" across its diagonal, and "0" everywhere else. 
        //The identity matrix is the matrix equivalent of the number "1." For example, the number 1 multiplied by any number n equals n. 
        //The same is true of an identity matrix multiplied by a matrix of the same size: A × I = A. 
        //Note that an identity matrix can have any square dimensions.
        //only the result matrix needs to modified, there is no need for A or B matrix here
        //a 4 x 4 identity matrix will be generated, regardless how large A matrix and/or B matrix is/are
        resultOneOne.setText("1");
        resultTwoTwo.setText("1");
        resultThreeThree.setText("1");
        resultFourFour.setText("1");
        
        //the rest will be 0
        //1st row
        resultOneTwo.setText("0");
        resultOneThree.setText("0");
        resultOneFour.setText("0");
        //2nd row
        resultTwoOne.setText("0");
        resultTwoThree.setText("0");
        resultTwoFour.setText("0");
        //3rd row
        resultThreeOne.setText("0");
        resultThreeTwo.setText("0");
        resultThreeFour.setText("0");
        //4th row
        resultFourOne.setText("0");
        resultFourTwo.setText("0");
        resultFourThree.setText("0");
    }
    //done
    private void exitApp() {
        System.exit(0);
    }
    //done
    private void calculateEigenvalue(){
    //only a 2 x 2 matrix's Eigenvalues will be calculated
    
    det = (a11 * a22) - (a12 * a21);
        if (det != 0) {
            int x;
           // c.setText(Integer.toString(((a11 - x) * (a22 - x)) = (a12 * a22)));
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Unsupported at the moment!");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error!");
            alert.setContentText("Operation cannot be !");
            alert.showAndWait();
        }
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sumBtn.setOnAction(eh -> calculateSum());
        substractBtn.setOnAction(eh -> calculateSubstract());
        numMultiplyBtn.setOnAction(eh -> calculateMultiplyNum());
        matrixMultiplyBtn.setOnAction(eh -> calculateMultiplyMatrix());
        determinantBtn.setOnAction(eh -> calculateDeterminant());
        matrixPowerBtn.setOnAction(eh -> calculatePower());
        transposeBtn.setOnAction(eh -> calculateTranspose());
        inverseBtn.setOnAction(eh -> calculateInverse());
        identityBtn.setOnAction(eh -> calculateIdentity());
        EchelonBtn.setOnAction(eh -> calculateReducedRowEchelon());
        exitBtn.setOnAction(eh -> exitApp());
    } 
}


