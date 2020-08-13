config.output = config.output || {}
config.output.globalObject = "this"
config.target = "node"

config.resolve.modules.unshift("src/test/resources")

const TerserPlugin = require('terser-webpack-plugin');

config.optimization = {
  minimizer: [
    new TerserPlugin({
                       cache: true,
                       parallel: true,
                       sourceMap: true,
                       terserOptions: {
                         sourceMap: true,
                       }
                     })
  ],
};
