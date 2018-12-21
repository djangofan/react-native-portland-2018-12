/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React, { Component } from "react";
import { Platform, StyleSheet, Text, View } from "react-native";
import NativeColor from "./NativeColor";
import PDXButton from "./PDXButton";

const instructions = Platform.select({
  ios: "Press Cmd+R to reload,\n" + "Cmd+D or shake for dev menu",
  android:
    "Double tap R on your keyboard to reload,\n" +
    "Shake or press menu button for dev menu"
});

export default class App extends Component {
  state = { bgColor: "FFFFFF" };

  constructor() {
    super();
    NativeColor.bgColor().then(bgColor => {
      this.setState({ bgcolor: bgColor });
    });
  }

  render() {
    return (
      <View
        style={{ ...styles.container, backgroundColor: this.state.bgcolor }}
      >
        <Text style={styles.welcome}>Welcome to React Native!</Text>
        <Text style={styles.instructions}>BGColor: {this.state.bgcolor}</Text>
        <PDXButton style={{ width: 120, height: 50 }} />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#FFFFFF"
  },
  welcome: {
    fontSize: 20,
    textAlign: "center",
    margin: 10
  },
  instructions: {
    textAlign: "center",
    color: "#333333",
    marginBottom: 5
  }
});
