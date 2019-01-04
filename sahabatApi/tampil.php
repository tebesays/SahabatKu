<?php
include 'conn.php';

	$stmt = $conn->prepare("SELECT * FROM sahabat");
	//executing the query 
	$stmt->execute();
	
	//binding results to the query 
	$stmt->bind_result($id, $nama, $foto, $panggil, $tlp, $alamat, $desk, $ig);
	
	$products = array(); 
	
	//traversing through all the result 
	while($stmt->fetch()){
		$temp = array();
		$temp['id'] = $id;
		$temp['nama'] = $nama;  
		$temp['foto'] = $foto;
		$temp['panggil'] = $panggil;
		$temp['tlp'] = $tlp;
		$temp['alamat'] = $alamat;
		$temp['desk'] = $desk;
		$temp['ig'] = $ig;
		array_push($products, $temp);
	}
	
	//displaying the result in json format 
	echo json_encode($products);
?>
