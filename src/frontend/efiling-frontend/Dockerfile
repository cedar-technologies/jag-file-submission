# pull official base image
FROM node:13.12.0-alpine

# set working directory
WORKDIR /efiling-frontend

# add `/node_modules/.bin` to $PATH
ENV PATH ./node_modules/.bin:$PATH

# install dependencies
COPY . .
RUN yarn install
RUN yarn global add react-scripts@3.4.1

# add app
COPY . .

# start app
CMD ["yarn", "start"]
