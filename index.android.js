'use strict';

var React = require('react-native');
var {
    Text,
    Component,
    AppRegistry,
    StyleSheet,
    Navigator,
    ListView,
    TouchableHighlight,
    View,
    } = React;
//iOS Native SlideViewController控件

//For redux
import {Provider} from "react-redux"


const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#E7EAEC'
    },
    navigator: {
        backgroundColor: '#E7EAEC'
    }
});


class JS_Sample1 extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          Welcome to Sample1!
        </Text>
        <Text style={styles.instructions}>
          To get started, edit index.android.js
        </Text>
        <Text style={styles.instructions}>
          Shake or press menu button for dev menu
        </Text>
      </View>
    );
  }
}
class JS_Sample2 extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          Welcome to Sample2!
        </Text>
        <Text style={styles.instructions}>
          To get started, edit index.android.js
        </Text>
        <Text style={styles.instructions}>
          Shake or press menu button for dev menu
        </Text>
      </View>
    );
  }
}
AppRegistry.registerComponent('JS_Sample1', () => JS_Sample1);
AppRegistry.registerComponent('JS_Sample2', () => JS_Sample2);
