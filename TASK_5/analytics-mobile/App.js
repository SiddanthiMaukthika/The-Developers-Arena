import React, { useEffect, useState } from 'react';
import { View, Text, StyleSheet } from 'react-native';

export default function App() {
  const [prediction, setPrediction] = useState("Loading...");

  useEffect(() => {
    fetch("http://localhost:8080/api/analytics/predict")
      .then(res => res.json())
      .then(data => setPrediction(data.message))
      .catch(() => setPrediction("Error fetching data"));
  }, []);

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Analytics Mobile Dashboard</Text>
      <Text style={styles.card}>Prediction: {prediction}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center'
  },
  title: {
    fontSize: 22,
    fontWeight: 'bold',
    marginBottom: 20
  },
  card: {
    fontSize: 18,
    backgroundColor: '#eee',
    padding: 10
  }
});